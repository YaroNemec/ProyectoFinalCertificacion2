Feature: Login Demo Orange Web

  Background: Login de administrador
    Given Estoy en Orange

    @loginConCredencialesValidos
    Scenario: Login en la pagina de Orange
      Given Coloco como username "Admin"
      And Coloco de contraseña "admin123"
      When Le doy click al botón Login
      Then La pagina principal debería mostrarse
      And Doy click en el user drop down
      And Doy click en el boton de Logout