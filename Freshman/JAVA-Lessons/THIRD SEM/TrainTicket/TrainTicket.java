class TrainTicket{
    private double fare;
    
    public double getFare(){
        return fare;
    }
    
    public void setFare(double fare){
        if(fare >= 0){
            this.fare = fare;
        } else {
            System.out.println("Invalid fare amount");
        }
    }
}
