package graphiceditor;

public class main {
    public static void main (String[] args){
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        GraphicEditor editor = new GraphicEditor();
        
        editor.DrawShape(square);
        editor.DrawShape(rectangle);
        editor.DrawShape(circle);
    }
}
