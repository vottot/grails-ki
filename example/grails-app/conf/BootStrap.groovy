import org.apache.ki.crypto.hash.Sha1Hash

class BootStrap {
  boolean runBS = false

  def init = {servletContext ->

    if (!runBS) {
      runBS = true
      
      for (i in 0..5) {
        def user = new KiUser()
        user.username = "user${i}"

        def pwEnc = new Sha1Hash('user' + i)
        user.passwordHash = pwEnc.toHex()

        user.save()
      }

      for(i in 0..5) {
        def role = new KiRole()

        role.name = "role${i}"
        role.save()
      }

      // Used with security filter for HasRoleController
      def roleMap1 = new KiUserRoleRel()
      def user0 = KiUser.get(1)
      def role0 = KiRole.get(1)
      roleMap1.user = user0
      roleMap1.role = role0
      roleMap1.save()

      // Used with RequiresRole on index action for RequiresRoleController
      def roleMap2 = new KiUserRoleRel()
      def user1 = KiUser.get(2)
      def role1 = KiRole.get(2)
      roleMap2.user = user0
      roleMap2.role = role0
      roleMap2.save()

    }
  }

  def destroy = {
  }
}