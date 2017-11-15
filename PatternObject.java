import java.util.*;


public class PatternObject
{
Vector position;
Vector positionOffset;
Vector rotation;
boolean patterned = false;
int state = 0;

public PatternObject(Vector p, Vector o, Vector r, boolean pa, int s)
{

this.position = p;
this.positionOffset = o;
this.rotation = r;
this.patterned = pa;
this.state = s;
}



} 



