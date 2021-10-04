public class Methods
{
    private static Methods methods = null;

    private Methods() {

    }

    public static Methods GetInstance()
    {
        if (methods == null)
            methods = new Methods();
        return methods;

    }

}
