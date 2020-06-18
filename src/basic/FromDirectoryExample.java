package basic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class FromDirectoryExample {
	public static void main(String[] args) {
		Path path = Paths.get("c:/program files");
		try {
			Stream<Path> stream = Files.list(path);
			// 람다식
			stream.forEach((t) -> System.out.println(t.getFileName()));
//			stream.forEach(new Consumer<Path>() {
//				@Override
//				public void accept(Path t) {
//					System.out.println(t.getFileName());
//				}
//			});
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// file
		path = Paths.get("src/listData.txt");
		try {
			Stream<String> strstream = Files.lines(path);
			strstream.forEach(System.out::println);		// (t -> System.out.println(t));
			strstream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
