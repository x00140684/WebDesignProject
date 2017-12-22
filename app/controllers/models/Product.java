//DAWID RESZKA X00140684
package models.products;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Product extends Model {
    @Id
    private String id;

    @Constraints.Required
    private String name;
    @Constraints.Required
    private String make;
    @Constraints.Required
    private String model;
    @Constraints.Required
    private String description;


    public Product() {

    }

    public static Finder<String, Product> find = new Finder<String, Product>(Product.class);

    public static List<Product> findAll() {
        return Product.find.all();
    }


    public static Product getProductById(String id) {
        if (id==null)
            return null;
        else

            return find.byId(id);

    }
    public String getId(){
        return this.id;
        }
        public void setID(String id) {
            this.id = id;
         }
        public String getName(){
            return this.name;
            }
            public void setName(String name) {
                this.name = name;
             }
            public String getMake(){
                return this.make;
                }
                public void setMake(String make) {
                    this.make = make;
                 }
                public String getModel(){
                    return this.model;
                    }
                    public void setModel(String model) {
                        this.model = model;
                     }
                    public String getDescription(){
                        return this.description;
                        }
                        public void setDescription(String description) {
                            this.description = description;
                         }






}