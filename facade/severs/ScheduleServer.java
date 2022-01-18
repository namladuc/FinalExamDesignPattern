package facade.severs;

class ScheduleServer {
    void startBooting() {
        System.out.println("Starts booting...");
    }

    void readSystemConfigFile() {
        System.out.println("Reading system config files...");
    }

    void init() {
        System.out.println("Initializing...");
    }

    void initializeContext() {
        System.out.println("Initializing context...");
    }

    void initializeListeners() {
        System.out.println("Initializing listeners...");
    }

    void createSystemObjects() {
        System.out.println("Creating system objects...");
    }

    void releaseProcesses() {
        System.out.println("Releasing processes...");
    }

    void destory() {
        System.out.println("Destorying...");
    }

    void destroySystemObjects() {
        System.out.println("Destroying system objects...");
    }

    void destoryListeners() {
        System.out.println("Destroying listeners...");
    }

    void destoryContext() {
        System.out.println("Destroying context...");
    }

    void shutdown() {
        System.out.println("Shutting down...");
    }
}
