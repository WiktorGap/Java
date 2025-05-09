public class cmdProxy implements cmdExec{
    private cmdExec executor;
    private  boolean isPreviledges;
    public cmdProxy(String login, String password)
    {
        if(login.equals("aston") && password.equals("martin"))
        {
            isPreviledges = true;
        }else
        {
            isPreviledges = false;
        }
        executor = new cmdExecImplementation();
    }
    public void execute(String cmd)
    {
        if(cmd.equals("Launch rockers"))
        {
            if(isPreviledges)
            {
                executor.execute(cmd);
            }else
            {
                System.out.println("You are not authorized to this destructive action");
            }
        } else if(cmd.equals("Breaking law"))
        {
            if(isPreviledges) {
                executor.execute(cmd);
            }else
            {
                System.out.println("You are not authorized to this destructive action");
            }
        }else
        {
            executor.execute(cmd);
        }

    }
}
