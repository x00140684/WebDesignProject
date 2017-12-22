package models.users;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class User extends Model {
    @Id
    private String email;

    @Constraints.Required
    private String password;
    @Constraints.Required
    private String role;

    public User() {

    }

    public static Finder<String, User> find = new Finder<String, User>(User.class);

    public static List<User> findAll() {
        return User.find.all();
    }

    public static User authenticate(String email, String password) {
        return find.query().where().eq("email",email).eq("password",password).findUnique();
    }

    public static User getUserById(String id) {
        if (id==null)
            return null;
        else

            return find.byId(id);

    }
    public String getRole(){
        return this.role;
        }






}