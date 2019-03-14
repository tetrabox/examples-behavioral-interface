package org.gemoc.arduino.sequential;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoFactory;

@SuppressWarnings("all")
public interface XArduinoMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract ArduinoFactory getArduinoFactory();
  
  public abstract void save(final String uri) throws IOException;
}
