package society {
  
  package proffesional {
    class Executive {
      private[proffesional] var workDetails = null
      private[society] var friends = null
      private[this] var secrets = null

      def help(another : Executive) = {
        println(another.workDetails)
        println(secrets)
        println(another.secrets) //ERROR
      }
    }

    class Assistant {
      def assist(anExec: Executive) = {
        println(anExec.workDetails)
        println(anExec.friends)
      }
    }
  }

  package social {
    class Acquaintance {
      def socialize(person: proffesional.Executive) {
        println(person.friends)
        println(person.workDetails) //ERROR
      }
    }
  }
}
