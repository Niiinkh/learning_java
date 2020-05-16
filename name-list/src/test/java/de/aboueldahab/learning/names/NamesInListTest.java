package de.aboueldahab.learning.names;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NamesInListTest {

	private NamesInList namesInList;
	private List<String> listOfNames;
	private List<String> sortedList;

	@BeforeEach
	public void setup() {
		namesInList = new NamesInList();
		listOfNames = namesInList.getNamesAsList();
		sortedList = namesInList.getSortedList();
	}

	@Test
	public void listOfNamesIsNotNullOrEmpty() {
		assertNotNull(listOfNames);
		assertThat(listOfNames, is(not(empty())));
	}

	@Test
	public void listOfNamesSizeIsCorrect() {
		assertThat(listOfNames, hasSize(5111));
	}

	@Test
	public void testNamesAreReadCorrectly() {
		assertThat(listOfNames.get(20), is("Nananne"));
		assertThat(listOfNames.get(175), is("Ola"));
		assertThat(listOfNames.get(1296), is("Drucie"));
		assertThat(listOfNames.get(4103), is("Stephanie"));
	}

	@Test
	public void sortedlistOfNamesIsNotNullOrEmpty() {
		assertNotNull(sortedList);
		assertThat(sortedList, is(not(empty())));
	}

	@Test
	public void sortedlistOfNamesSizeIsCorrect() {
		assertThat(sortedList, hasSize(5111));
	}

	@Test
	public void testNamesAreSortedCorrectly() {
		assertThat(sortedList.get(20), is("Addi"));
		assertThat(sortedList.get(175), is("Allys"));
		assertThat(sortedList.get(1296), is("Danit"));
		assertThat(sortedList.get(4103), is("Phillis"));
	}

}
