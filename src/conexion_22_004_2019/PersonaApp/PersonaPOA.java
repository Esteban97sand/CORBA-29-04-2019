package PersonaApp;


/**
* PersonaApp/PersonaPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Persona.idl
* martes 23 de abril de 2019 04:25:50 PM COT
*/

public abstract class PersonaPOA extends org.omg.PortableServer.Servant
 implements PersonaApp.PersonaOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("insertarPersona", new java.lang.Integer (0));
    _methods.put ("consultarPersona", new java.lang.Integer (1));
    _methods.put ("actualizarPersona", new java.lang.Integer (2));
    _methods.put ("eliminarPersona", new java.lang.Integer (3));
    _methods.put ("listarPersonas", new java.lang.Integer (4));
    _methods.put ("shutdown", new java.lang.Integer (5));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // PersonaApp/Persona/insertarPersona
       {
         int identificacion = in.read_long ();
         String nombre = in.read_wstring ();
         String apellido = in.read_wstring ();
         String direccion = in.read_wstring ();
         String telefono = in.read_wstring ();
         String email = in.read_wstring ();
         boolean $result = false;
         $result = this.insertarPersona (identificacion, nombre, apellido, direccion, telefono, email);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // PersonaApp/Persona/consultarPersona
       {
         int identificacion = in.read_long ();
         String $result = null;
         $result = this.consultarPersona (identificacion);
         out = $rh.createReply();
         out.write_wstring ($result);
         break;
       }

       case 2:  // PersonaApp/Persona/actualizarPersona
       {
         int identificacion = in.read_long ();
         String nombre = in.read_wstring ();
         String apellido = in.read_wstring ();
         String direccion = in.read_wstring ();
         String telefono = in.read_wstring ();
         String email = in.read_wstring ();
         boolean $result = false;
         $result = this.actualizarPersona (identificacion, nombre, apellido, direccion, telefono, email);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // PersonaApp/Persona/eliminarPersona
       {
         int identificacion = in.read_long ();
         boolean $result = false;
         $result = this.eliminarPersona (identificacion);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 4:  // PersonaApp/Persona/listarPersonas
       {
         String $result = null;
         $result = this.listarPersonas ();
         out = $rh.createReply();
         out.write_wstring ($result);
         break;
       }

       case 5:  // PersonaApp/Persona/shutdown
       {
         this.shutdown ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:PersonaApp/Persona:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Persona _this() 
  {
    return PersonaHelper.narrow(
    super._this_object());
  }

  public Persona _this(org.omg.CORBA.ORB orb) 
  {
    return PersonaHelper.narrow(
    super._this_object(orb));
  }


} // class PersonaPOA
