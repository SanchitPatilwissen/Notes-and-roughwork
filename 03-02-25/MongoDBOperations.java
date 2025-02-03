import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Projections;
import com.mongodb.client.model.Sorts;
import com.mongodb.client.model.Updates;

import java.util.*;

public class MongoDBOperations {
	public static void main(String[] args) {
		System.out.println("Hello World");
		MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
		MongoDatabase database = mongoClient.getDatabase("demodb");
		MongoCollection collection = database.getCollection("Employee");
		/*
		
		1) Iterating through the documents
		
		FindIterable<Document> i = collection.find();
		
		for(Document d : i) {
			System.out.println(d.toJson());
		}
		
		System.out.println("Successfully connected to MongoDB");
		*/
		
		Document doc = new Document();
		/*
		2) Inserting a document - Method 1 (Insert One)
		
		doc.append("name", "Pooja");
		doc.append("age", "34");
		doc.append("salary", "60000");
		doc.append("Designation", "Programmar");
		
		collection.insertOne(doc);
		*/
		
		/*
		3) Inserting a document - Method 2 (Insert One)
		collection.insertOne(new Document().append("name", "Angela").append("age", 49).append("salary", 80000).append("designation", "Accountant"));
		*/
		
		/*
		4) Inserting a document - (InsertMany) 
		List<Document> empList = new ArrayList<Document>();
		
		empList.add(new Document().append("name", "Shiva").append("age", 46).append("salary", 120000).append("designation", "Manager"));
		empList.add(new Document().append("name", "Ravi").append("age", 48).append("salary", 80000).append("designation", "Tester"));
		
		collection.insertMany(empList);
		*/
		
		/*
		
		5) Iterations --> Applying Projections to exclude/include
		*/
		Bson projection1 = Projections.excludeId();
		Bson projection2 = Projections.exclude("_id", "age", "salary");
		/*
		6) Iterations --> Applying Filters, sorts
		Bson filter = Filters.eq("designation", "Manager");
		
		Bson asort = Sorts.ascending("salary");
		Bson bsort = Sorts.ascending("age");
		// FindIterable<Document> i = collection.find().projection(projection1).sort(bsort);
		*/
		
		/*
		7) Update a record
		Bson filter = Filters.gt("age", 35);
		Bson update = Updates.set("designation", "Manager");
		
		collection.updateMany(filter, update);

		*/
		
		/*
		8) Deleting records
		*/
		Bson filter = Filters.gte("age", 48);
		
		collection.deleteMany(filter);
		
		FindIterable<Document> i = collection.find(filter).projection(projection1);
		
		for(Document d : i) {
			System.out.println(d.toJson());
		}
		
		System.out.println("Successfully Performed operations on mongoDB!");
		mongoClient.close();
		
	}
}
