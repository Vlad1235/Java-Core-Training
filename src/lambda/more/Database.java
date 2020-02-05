package lambda.more;

@FunctionalInterface
public interface Database {
    User create(String name, String password);
}
