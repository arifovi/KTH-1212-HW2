/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai.hw1;

/**
 *
 * @author Arif
 */
import java.io.Serializable;

public class Artifact implements Serializable {
	public enum Genre {
		PAINTING, 
		SCULPTURE,
		PHOTOGRAPHY};
	
	private long id;
	private String name;
	private String creator;
	private int creationYear;
	private Genre genre;
	
	public Artifact() {
		id = (long) (Math.random() * Long.MAX_VALUE);
		name = "Artifact " + id;
		creator = "Creator " + id;
		creationYear = (int) (Math.random() * 500 + 1500);
		
		int randomGenreIndex = (int) (Math.random() * 2);
		genre = Genre.values()[randomGenreIndex];
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public int getCreationYear() {
		return creationYear;
	}

	public void setCreationYear(int creationYear) {
		this.creationYear = creationYear;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
}

