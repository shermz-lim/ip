package seedu.duke;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;


public class TaskListTest {
    @Test
    public void markTaskDone_indexGiven_success() {
        List<Task> taskList = List.of(new Todo("abc"), new Todo("def"), new Todo("ghi"));
        TaskList tasks = new TaskList(taskList);
        try {
            tasks.markTaskDone(1);
            assertTrue(taskList.get(1).getIsDone());
        } catch (DukeException e) {
            fail();
        }
    }

    @Test
    public void addTask_taskGiven_success() {
        List<Task> taskList = new ArrayList<>();
        TaskList tasks = new TaskList(taskList);
        tasks.addTask(new Todo("abc"));
        assertEquals(tasks.size(), 1);
    }
}
