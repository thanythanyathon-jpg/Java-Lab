//Name: Thanyathon Kitsakun
//ID: 6887101
//Section: 1

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import com.google.gson.Gson;

public class MovieCatalog {
	
	private List<Movie> movies = null;
	
	MovieCatalog()
	{
		movies = new ArrayList<Movie>();
	}
	
	public List<Movie> getAllMovies()
	{
		return movies;
	}
	
	public void loadMovies(String filename)
	{
		//********************* YOUR CODE HERE **************************//
    try {
        FileReader reader = new FileReader(filename);
        CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);

        for (CSVRecord record : csvParser) {
            String title = record.get("Movie Title");
            String genre = record.get("Genre");
            String leadStudio = record.get("Lead Studio");

            double audienceScore = Double.parseDouble(record.get("Audience Score %"));
            double profitability = Double.parseDouble(record.get("Profitability"));
            double rottenScore = Double.parseDouble(record.get("Rotten Tomatoes %"));

            String grossStr = record.get("Worldwide Gross").replace("$", "").replace(",", "");
            double worldwideGross = Double.parseDouble(grossStr);

            int year = Integer.parseInt(record.get("Year"));

            Movie movie = new Movie(title, genre, leadStudio,
                    audienceScore, profitability, rottenScore,
                    worldwideGross, year);

            movies.add(movie);
        }

        csvParser.close();

    } catch (IOException e) {
        e.printStackTrace();
    }
		//**************************************************************//
	}
	
	public List<Movie> searchByTitle(String keyword)
	{
		//********************* YOUR CODE HERE **************************//
	 List<Movie> result = new ArrayList<>();

    for (Movie m : movies) {
        if (m.getTitle().contains(keyword)) {
            result.add(m);
        }
    }

    return result;
		//**************************************************************//
	}
	
	public List<Movie> searchByRottenTomatoesScores(double lowScore , double highScore)
	{
		//********************* YOUR CODE HERE **************************//
    List<Movie> result = new ArrayList<>();

    for (Movie m : movies) {
        if (m.getRottenTomatoesScore() >= lowScore &&
            m.getRottenTomatoesScore() <= highScore) {
            result.add(m);
        }
    }

    return result;
		//**************************************************************//
	}
	
	public static void saveMoviesJSON(List<Movie> movieList, String outFilename)
	{
		//********************* YOUR CODE HERE **************************//
    Gson gson = new Gson();

    try {
        BufferedWriter writer = new BufferedWriter(new FileWriter(outFilename));
        String json = gson.toJson(movieList);
        writer.write(json);
        writer.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
		//**************************************************************//
	}
}


