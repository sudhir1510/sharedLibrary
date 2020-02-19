import com.cleverbuilder.Student

def call(String name = 'human') {
  def msg =  Student.getMessage( name )
  
  echo msg
}
