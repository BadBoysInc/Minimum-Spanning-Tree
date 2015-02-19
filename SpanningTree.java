import java.io.*;

class SpanningTree{
	
	public static void main(String[] args){
		Reader r = new Reader();
		try{
			r.read(args[1]);
		
			if(args[0].equals("-p1")){
				System.out.println("Total Cable Needed: " + String.format("%.2f", totalEdgeWeight(r.graph())) + "m");
			}
		}catch(IOException e){
			System.err.println("Wrong Filename idiot");
		}
	}
	
	private static double totalEdgeWeight(Graph g){
		double sum = 0;
		for(Edge e :g.edges()){
			sum = sum + e.weight();
		}
		return sum;
	}
}
