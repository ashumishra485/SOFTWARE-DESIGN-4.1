
public class FootballTeam
{
   public static final String EMAIL_STUB = "@my.email";

   private String name;
   private String id;

   public FootballTeam ()
   {
      name = "";
      id   = "";
   }

   public FootballTeam (String name, String id)
                        throws FootballTeamException
   {
      
      name = name.trim ();
      id   = id.trim ();

      if (name.length () == 0)
      {
         
         throw new FootballTeamException ("Error: Name cannot be blank.");
      }

      else if (id.length () == 0)
      {
         
         throw new FootballTeamException ("Error: Jersey Number cannot be blank.");
      }

      else
      {
         
         this.name = name;
         this.id   = id;
      }
   }

   public String getName ()
   {
      return name;
   }

   public String getId ()
   {
      return id;
   }

   public void setName (String name)
   {
      this.name = name;
   }

   public void setId (String id)
   {
      this.id = id;
   }

   @Override
   public String toString ()
   {
      return id + "\t" + name + "\t" + id + EMAIL_STUB;
   }

} 