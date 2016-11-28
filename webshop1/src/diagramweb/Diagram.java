package diagramweb;
import webshop.x.model.Webshop;
import webshop.x.model.User;
import webshop.x.model.Administrator;
import webshop.x.model.Customer;
import webshop.x.model.Shipping_Info;
import webshop.x.model.Shopping_Cart;
import webshop.x.model.Orders;
import webshop.x.model.Orders_Detail;
import webshop.x.model.Price;
import webshop.x.model.Product;
import hu.elte.txtuml.api.layout.ClassDiagram;
import hu.elte.txtuml.api.layout.Column;
import hu.elte.txtuml.api.layout.Row;

public class Diagram extends ClassDiagram {
	  @Row(Webshop.class)
	  @Row({Shopping_Cart.class,Customer.class, User.class,Administrator.class})
	  @Row({Product.class, Orders.class,Shipping_Info.class})
	  @Row({Price.class, Orders_Detail.class})
	  @Column({Shopping_Cart.class, Product.class,Price.class})
	  @Column({Customer.class, Orders.class,Orders_Detail.class})
	  @Column({Webshop.class,User.class,Shipping_Info.class})
	  @Column(Administrator.class)
	  class MyLayout extends Layout {};
}

