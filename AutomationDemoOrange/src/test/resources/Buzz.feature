Feature: Buzz Page
  Background: Buzz Page debería mostrar la publicacion
    Given Estoy en Orange

    @VerificarMensajeEnBuzzPage
    Scenario: Verify is Displayed a publication
      Given Coloco como username "Admin"
      And Coloco de contraseña "admin123"
      When Le doy click al botón Login
      Then Doy click en el buzz button
      And Escribo el mensaje "I tests the buzz" para postearlo
      And Doy click en Post Button
      Then Verifico que el mensaje "I tests the buzz" se haya posteado el mensaje en la buzz page
      And Doy click en el user drop down
      And Doy click en el boton de Logout