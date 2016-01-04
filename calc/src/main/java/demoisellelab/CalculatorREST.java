package demoisellelab;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("calculator")
public class CalculatorREST {

	@POST
	@Path("sum")
	@Consumes("application/json")
	@Produces("text/plain")
	public Integer sum(Data data){
		return data.a+ data.b;
	}
	
	public static class Data{
		public Integer a;
		public Integer b;
	}
}
