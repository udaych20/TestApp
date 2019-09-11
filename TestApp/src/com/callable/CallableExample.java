package com.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class CallableExample {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Runnable first = () -> System.out.println("Hai First Thread");
		Runnable second = () -> System.out.println("Hai Second Thread");

		Callable<Integer> call = () -> 100;

		FutureTask<String> f1 = new FutureTask<>(first, "First");
		FutureTask<String> f2 = new FutureTask<>(second, "Second");
		FutureTask<Integer> f3 = new FutureTask<>(call);

		ExecutorService pool = Executors.newFixedThreadPool(3);
		pool.submit(f1);
		pool.submit(f2);
		pool.submit(f3);
		System.out.println(f1.get());
		System.out.println(f2.get());
		System.out.println(f3.get());
		while (true) {
			if (f1.isDone() && f2.isDone() && f3.isDone()) {
				pool.shutdown();
				return;
			}
		}

	}
}
