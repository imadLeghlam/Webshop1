package diagramweb;
import hu.elte.txtuml.api.layout.Column;
import hu.elte.txtuml.api.layout.Row;
import hu.elte.txtuml.api.layout.StateMachineDiagram;
import webshop.x.model.Order;
import webshop.x.model.Order.Available;
import webshop.x.model.Order.Cancel;
import webshop.x.model.Order.CheckProduct;
import webshop.x.model.Order.GetProduct;
import webshop.x.model.Order.Init;
import webshop.x.model.Order.NotAvailable;
import webshop.x.model.Order.SelectOrder;


public class MachineDiagram extends StateMachineDiagram<Order> {
	@Column({Init.class,SelectOrder.class,CheckProduct.class,Available.class,GetProduct.class})
	@Column({NotAvailable.class, Cancel.class})
	@Row({ NotAvailable.class })
	@Row({Cancel.class})
	class L extends Layout {}


}
