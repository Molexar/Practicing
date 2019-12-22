package classes;

public class Main {

    public static void main(String[] args) {
	    class Vector {
	        private double x;
	        private double y;
	        private double z;

	        public Vector(double x, double y, double z){
                this.x = x;
                this.y = y;
                this.z = z;
            }

            public double lenVector(){
	            return Math.sqrt(x*x + y*y + z*z);
            }
            public double multiVector(Vector vector){
	            return x*vector.x + y*vector.y + z*vector.z;
            }
            public double cosVector(Vector vector){
	            return this.multiVector(vector) / (this.lenVector() * vector.lenVector());
            }
            public Vector sumVector(Vector vector){
	            return new Vector(
	                    this.x + vector.x,
                        this.y + vector.y,
                        this.z + vector.z);
            }
            public Vector diffVector(Vector vector){
                return new Vector(
                        this.x - vector.x,
                        this.y - vector.y,
                        this.z - vector.z);
            }
            public Vector[] randomVectors(int n){
	            Vector vectors[] = new Vector[n];
	            for (int i=0;i<n;i++){
	                vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
                }
	            return vectors;
            }
            @Override
            public String toString() {
                return "Vector{" +
                        "x=" + x +
                        ", y=" + y +
                        ", z=" + z +
                        '}';
            }
        }
    }
}
