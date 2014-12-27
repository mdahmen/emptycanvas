/*

    Vous êtes libre de :

*/
package info.emptycanvas.library.extra;

import info.emptycanvas.library.object.TColor;
import info.emptycanvas.library.object.Point3D;
import info.emptycanvas.library.object.Barycentre;
import info.emptycanvas.library.object.Representable;
import info.emptycanvas.library.object.MODObjet;
import java.util.ArrayList;

public class Vis extends  Representable {

    private String id = "Vis";
    private ArrayList<Point3D> points;
    private double toursParCourbe;
	private Barycentre position;

    public Vis(ArrayList<Point3D> points, double toursParCourbe) {
        this.points = points;
        this.toursParCourbe = toursParCourbe;
    }

    public String id() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
   public Representable place(MODObjet aThis) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supporteTexture() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

	@Override
	public void position(Barycentre p) {
		this.position = p;
		
	}

    public TColor texture() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Barycentre position() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}
