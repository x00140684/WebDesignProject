package controllers;

import play.mvc.*;
import views.html.*;
import models.*;
import models.users.*;
import models.products.*;
import play.db.ebean.Transactional;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render());
    }
    public Result about() {
        return ok(about.render());
    }
    public Result basket() {
        return ok(basket.render());
    }
    public Result cars() {
        return ok(cars.render());
    }
    public Result contact() {
        return ok(contact.render());
    }
    public Result getinvolved() {
        return ok(getinvolved.render());
    }
    public Result login() {
        return ok(login.render());
    }
    public Result parts() {
        return ok(parts.render());
    }
    public Result register() {
        return ok(register.render());
    }
    public Result product() {
        return ok(cars.render());
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result deleteProduct(String id) {
        Product.find.ref(id).delete();
        flash("success", "Product has been deleted");
        return redirect(controllers.routes.HomeController.cars());
    }

}
