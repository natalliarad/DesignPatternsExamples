package behaviour.chainOfResponsibilities.authentificationHandler;

class Authentication extends AbstractHandler {

    Authentication() {
        //more code
    }

    @Override
    void handleRequest(final Employee user) {
        if (checkStatus(user)) {
            //some code here
        }
    }

    private boolean checkStatus(final Employee user) {
        final boolean flag = true;
        System.out.println(user);
        System.out.println("check user status");
        //check user status

        return flag;
    }
}
