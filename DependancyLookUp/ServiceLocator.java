package DependancyLookUp;

 class ServiceLocator {
    public static GPS getGPS(){
        System.out.println("Looking Up GPS Dependency");
        return new GPS();
    }
}
