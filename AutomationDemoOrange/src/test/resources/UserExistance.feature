Feature: UserExistance
  Background: PIM Page debería mostrar un primer y segundo nombre especifico
    Given Estoy en Orange

    @VerificarExistenciaDeUsuario
    Scenario: chequear existencia de usuario
      Given Coloco como username "Admin"
      And Coloco de contraseña "admin123"
      When Le doy click al botón Login
      Then Doy click en el botón menu burguer de PIM
      And Doy click en el boton de employeeList
      And Relleno el campo de nombre con "Aron Smith"
      And Doy click al boton buscar
      And Verifico nombre de empleado "Aron Smith"
      And Doy click en el user drop down
      And Doy click en el boton de Logout