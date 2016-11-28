package webshop.main;
import java.io.IOException;

import hu.elte.txtuml.api.model.Action;
import hu.elte.txtuml.api.model.execution.ModelExecutor;
import webshop.x.model.Buy;
import webshop.x.model.ClickOnOrder;
import webshop.x.model.Order;
import webshop.x.model.Reselect;
import webshop.x.model.Stop;


public class Main {
	static Order orderr ;
	static void init (){
		orderr = Action.create(Order.class);
		Action.start(orderr);
	}

public static void main(String[] args) throws IOException {
	ModelExecutor.create().setTraceLogging(true).start(Main::init);
	System.in.read();
	Action.send(new ClickOnOrder(), orderr);
	System.in.read();
	Action.send(new Stop(), orderr);
	System.in.read();
	Action.send(new ClickOnOrder(), orderr);
	System.in.read();
	Action.send(new ClickOnOrder(), orderr);
	System.in.read();
	Action.send(new Reselect(), orderr);
	System.in.read();
	ModelExecutor.create().setTraceLogging(true).start(Main::init);
	System.in.read();
	Action.send(new ClickOnOrder(), orderr);
	
	
	System.in.read();
	Action.send(new Reselect(), orderr);
	System.in.read();


	
	
	
	
	
}
}