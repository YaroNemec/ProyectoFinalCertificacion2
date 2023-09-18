Feature: PIM Page
  Background: Se debería poder crear un usario en la PIM Page
    Given Estoy en Orange

  @CrearUsuario
  Scenario: Crear usuario
    Given Coloco como username "Admin"
    And Coloco de contraseña "admin123"
    When Le doy click al botón Login
    Then Doy click en el botón menu burguer de PIM
    And Le doy click al boton Add en la pagina de PIM
    And Lleno los datos de add Employe con
      | Aron | Smith | Anoncab | 456 |
    Then Doy click en el boton guardar Empleado
    And Doy click en el user drop down
    And Doy click en el boton de Logout