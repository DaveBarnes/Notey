package rest.notey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;
import javax.imageio.*;

import java.sql.*;
import java.io.*;
import java.awt.image.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


// @Path here defines class level path. Identifies the URI path that 
// a resource class will serve requests for.
@Path("notey")
public class Notey {

	// @GET here defines, this method will process HTTP GET requests.
	// @Path here defines method level path. Identifies the URI path that a resource class method will serve requests for.
	// @Produces here defines the media type(s) that the methods of a resource class can produce.
	// @PathParam injects the value of URI parameter that defined in @Path expression, into the method.

	//GLOBAL Variables
	public int GnSequence = 100;						// sequence number for logins
	private Connection connect = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;

	
	// --------------------------------------------------------------------------------
	// --------------------------------------------------------------------------------
	// --------------------------------------------------------------------------------
	// --------------------------------------------------------------------------------
	// User FUnctions
	// --------------------------------------------------------------------------------
	// --------------------------------------------------------------------------------
	// --------------------------------------------------------------------------------
	// --------------------------------------------------------------------------------


	// --------------------------------------------------------------------------------
	// noteyTestPing: Returns a default string
	// Parameters	
	// Returns:		Alive			String			Alive message + current date and time
	//												Notey is alive @ 2014/07/18 13:24:56
	// --------------------------------------------------------------------------------
	@GET 
	@Path("/noteyTestPing") 
	@Produces(MediaType.APPLICATION_JSON)
	public String noteyTestPing() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		String sReturn = "{ \"PING\": [ \n{\"DESC\": \"Notey is alive\", \"TIME\": \"" + dateFormat.format(date) + "\" } \n] }";
		return sReturn;
	}

}
