package Carrito.inicio;


import com.mongodb.MongoClient;

import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import java.time.LocalDate;

import org.bson.Document;

import Carrito.models.Orden;
import Carrito.models.Producto;

import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;

/**
 * Hello world!
 *
 */
public class App 
{
	MongoClientURI uri = new MongoClientURI(
		    "mongodb+srv://Renato:1jose2renato@cluster0.2fdsm.mongodb.net/");
	MongoClient mongoClient = new MongoClient(uri);
	MongoDatabase database = mongoClient.getDatabase("carrito");
	
    public static void main( String[] args )
    {
    	MongoClientURI uri = new MongoClientURI(
    		    "mongodb+srv://Renato:1jose2renato@cluster0.2fdsm.mongodb.net/");
    	
    	
		//Producto producto = createProducto();
		//Document doc = createDBObject(producto);
		
		MongoClient mongoClient = new MongoClient(uri);
		MongoDatabase database = mongoClient.getDatabase("carrito");
		

		MongoCollection<Document> productoC = database.getCollection("producto");
		MongoCollection<Document> ordenC = database.getCollection("orden");
		
		BasicDBObject filtro = new BasicDBObject();
		filtro.put("_id", 1);
		FindIterable<Document> cur = productoC.find(filtro);
		cur.forEach(names -> System.out.print(names.toJson()));

		//create user
		//productoC.insertOne(doc);
		System.out.print("Sussesful");
			
		}
		
		private static Document createDBObject(Producto producto){
			
									
			Document document = new Document("_id", producto.getId()).
			append("nombre", producto.getNombre()).
			append("descripcion", producto.getDescripcion()).
			append("fecha", producto.getFecha()).
			append("precio", producto.getPrecio()).
			append("existencias", producto.getExistencias());
			
			return document;
		}
		/*
		
		private static Producto createProducto() {
			Producto p = new Producto();
			p.setId(3);
			p.setNombre("Camiseta rosa");
			p.setDescripcion("Camisera rosa estanpada modelo A");
			p.setFecha(LocalDate.now());
			p.setPrecio(38000);
			p.setExistencias(4);
			return p;
		}
		
		/*
		private static Orden createOrden() {
			Orden o = new Orden();
			o.setId(1);
			o.setIdUsuario();
			o.setIdDomicilio();
			o.setIdCarrito();
			o.setMetodoPago("Tarjeta de credito");
			o.setFecha(LocalDate.now());
			o.setTotal();
			return o;
		}
		*/
		

}
