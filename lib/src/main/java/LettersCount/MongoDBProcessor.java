package LettersCount;

import java.util.Map;

import org.apache.log4j.BasicConfigurator;
import org.bson.Document;
import org.bson.types.ObjectId;

import com.mongodb.client.MongoClients;

public class MongoDBProcessor {

	public void mongoDBConnection(LettersDTO lettersDTO) {
		BasicConfigurator.configure();

		try (var mongoClient = MongoClients.create()) {
			var database = mongoClient.getDatabase("lines_analysis");
			var todoCollection = database.getCollection("line_parameters");
			var todoDocument = new Document(Map.of("_id", new ObjectId(), "Line", lettersDTO.getReadedLine(),
					"Type of input", lettersDTO.getTypeOfInput(), "Vowels", lettersDTO.getVowelsCountInLine(),
					"Consonants", lettersDTO.getConsonantsCountInLine(), "Date of create", lettersDTO.getTimestamp()));

			todoCollection.insertOne(todoDocument);
		}

	}

	public void mongoDBReading() {
		BasicConfigurator.configure();
		try (var mongoClient = MongoClients.create()) {
			var database = mongoClient.getDatabase("lines_analysis");
			var todoCollection = database.getCollection("line_parameters");
			Document myDoc = todoCollection.find().first();
			System.out.println(myDoc.toJson());
		}
	}

}