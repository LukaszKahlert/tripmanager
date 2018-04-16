package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class PhotoTest {

	

	@Test
	public void testPhotoCtorIsCorrect() {
		Photo thePhoto = new Photo("Krak�w-Wawel");
		Assert.assertEquals("Krak�w-Wawel", thePhoto.comment());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testPhotoWithNullComment() {
		Photo thePhoto = new Photo(null);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testPhotoWithEmptyComment() {
		Photo thePhoto = new Photo("");

	}

}
