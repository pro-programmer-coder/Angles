package exercises;

public class Angle {
    private int degrees;

    public Angle(int degrees)
    {
//        if(degrees < 360 && degrees > -360) {
//            if (degrees >= 0) setDegrees(degrees);
//            else if (degrees < 0) setDegrees(360 + degrees);
//        }
//        else if(degrees >= 360){
//            while(degrees > 360){
//                degrees -= 360;
//                setDegrees(degrees);
//            }
//        }
//        else if(degrees < -360){
//            while(degrees < -360){
//                degrees += 360;
//            }
//            if (degrees >= 0) setDegrees(degrees);
//            else if (degrees < 0) setDegrees(360 + degrees);
//        }
        setDegrees(degrees);

    }

    public int getDegrees()
    {
        degrees %= 360;
        if(degrees < 0){
            degrees += 360;
        }
        return degrees;
    }

    private void setDegrees( int degrees )
    {
        this.degrees = degrees ;
    }

}
