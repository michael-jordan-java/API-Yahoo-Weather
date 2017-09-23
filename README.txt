Teste-Mobile:

Teste-Mobile possui duas telas, a primeira tela é a de Splash Screen no qual se conecta no servidor do Yahoo Weather fazendo uma requisição para conseguir a previsão do tempo, utilizando a localização do aparelho (Latitude e Longitude). A segunda tela mostra as informações obtidas: graus e condição climatica do tempo.


Build
============

1- Conecte o dispositivo no computador

2- Ative a depuração USB: Configurações -> Sobre o telefone -> toque em Número de compilação 7 vezes. Volte e encontre Opções de Desenvolvedor e ative.

3- Abra o terminal e acesse a pasta raiz do projeto.

4- Execute o comando "gradlew assembleDebug"

5- Execute o comando "gradlew installDebug"

6- O APK será gerado no path: "C: SeuCaminho\TesteMobile\app\build\outputs\apk\"

7- Com o terminal aberto acesse o caminho: "C: SeuCaminho\Android\sdk\platform-tools"
 * No qual terá de ter o SDK do Android instalado, caso não tenha faça o download https://developer.android.com/studio/index.html?hl=pt-br

8- Execute o comando "adb -d install C: SeuCaminho\TesteMobile\app\build\outputs\apk\your-app.apk"

9- Pronto o apk será instalado em seu dispositivo.
