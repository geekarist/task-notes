package com.github.geekarist.tasknotes.server;

import java.util.Arrays;

import junit.framework.Assert;

import org.junit.Test;

public class TaskListFetcherTest {

	@Test
	public void testFetch() {
		TaskList expectedList = new TaskList(Arrays.asList(new Task("task title", "task details")));
		
		TaskListFetcher fetcher = new TaskListFetcher();
		TaskList list = fetcher.fetch();
		Assert.assertEquals(expectedList , list);
	}
}
