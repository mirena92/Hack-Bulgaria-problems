package com.hackbulgaria.corejava;
import static org.junit.Assert.*;

import org.junit.Test;

public class ReduceFilePathTest {

	@Test
	public final void testReduce_file_path() {
		
		assertEquals("/", ReduceFilePath.reduce_file_path("/"));
		assertEquals("/", ReduceFilePath.reduce_file_path("/srv/../"));
		assertEquals("/srv/www/htdocs/wtf", ReduceFilePath.reduce_file_path("/srv/www/htdocs/wtf/"));
		assertEquals("/srv/www/htdocs/wtf", ReduceFilePath.reduce_file_path("/srv/www/htdocs/wtf"));
		assertEquals("/srv", ReduceFilePath.reduce_file_path("/srv/./././././"));
		assertEquals("/etc/wtf", ReduceFilePath.reduce_file_path("/etc//wtf/"));
		assertEquals("/", ReduceFilePath.reduce_file_path("/etc/../etc/../etc/../"));
		assertEquals("/", ReduceFilePath.reduce_file_path("//////////////"));
		assertEquals("/", ReduceFilePath.reduce_file_path("/../"));
	}

}
