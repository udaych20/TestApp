package optional;

import java.util.Optional;
import java.util.function.Consumer;

public class OptionalTest {
	public static void main(String[] args) {
		Optional<Integer> id = Optional.of(10);
		System.out.println();
		System.out.println(id.hashCode());
		System.out.println(id.get());
		Consumer<Integer> c = (ids) -> System.out.println(ids);
		c.accept(10);
	}

}
