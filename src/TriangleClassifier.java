public class TriangleClassifier {
    public String classifierTriangle(int edge1, int edge2, int edge3) {
        if(edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge2 + edge3 > edge1) {
            if(edge1 != edge2 && edge1 != edge3 && edge2 != edge3) return "Tam giac thuong";
            else if (edge1 == edge2 && edge1 == edge3) return "Tam giac deu";
            else return "Tam giac can";
        }
        else return "Khong phai la tam giac";


    }
}