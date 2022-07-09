package xy.cifuentes.example.calculadoracc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvResultado;
    float numero1 = 0.0f;
    float numero2 = 0.0f;
    String operacion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResultado = findViewById(R.id.tvResultado);
        //tvResultado.setText("Gola Carlos");
    }
    /**Esta es la funcion de sumar
     *
     * @param view  tv.Resultado muestra en pantalla el cero
     *             numero1 lo inicializamos en 0.0 y guardará el num1
     *              numero2 lo inicializamos en 0.0 y guardará el num2
     *             operacion lo colocamos vacío ya que es donde va a guardar la operacion a realizar
     */

    public void LimpiarResultado(View view) {
        tvResultado.setText("0");
        numero1 = 0.0f;
        numero2 = 0.0f;
        operacion = "";
    }
    /**Esta es la funcion de porcentaje
     *
             * @param view numero1 nos guarda el primer numero digitado
     *             operacion = identifica la operacion a realizar
     *             tv.resultado muestra el cero
     */

    public void OperacionPorcentaje(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        operacion = "%";
        tvResultado.setText("0");

    }
    /**Esta es la funcion de dividir
     *
     * @param view numero1 nos guarda el primer numero digitado
     *             operacion identifica la operacion a realizar
     *             tv.resultado muestra el cero
     */
    public void OperacionDivision(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        operacion = "/";
        tvResultado.setText("0");
    }

    public void EscribirSiete(View view) {

        float valor1 = Float.parseFloat(tvResultado.getText().toString());
        if(valor1 == 0.0){
            tvResultado.setText("7");
        }else{
            tvResultado.setText(tvResultado.getText() + "7");
        }
    }

    public void EscribirOcho(View view) {

        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor == 0.0){
            tvResultado.setText("8");
        }else{
            tvResultado.setText(tvResultado.getText() + "8");
        }
    }


    public void EscribirNueve(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor == 0.0){
            tvResultado.setText("9");
        }else{
            tvResultado.setText(tvResultado.getText() + "9");
        }
    }
    /**Esta es la funcion de multiplicación
     *
     * @param view numero1 nos guarda el primer numero digitado
     *             operacion identifica la operacion a realizar
     *             tv.resultado muestra el cero
     */
    public void OperacionMultiplicacion(View view) {
         numero1 = Float.parseFloat(tvResultado.getText().toString());
        operacion = "*";
        tvResultado.setText("0");
    }


    public void EscribirCuatro(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor == 0.0){
            tvResultado.setText("4");
        }else{
            tvResultado.setText(tvResultado.getText() + "4");
        }
    }

    public void EscribirCinco(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor == 0.0){
            tvResultado.setText("5");
        }else{
            tvResultado.setText(tvResultado.getText() + "5");
        }
    }

    public void EscribirSeis(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor == 0.0){
            tvResultado.setText("6");
        }else{
            tvResultado.setText(tvResultado.getText() + "6");
        }
    }
    /**Esta es la funcion de Restarr
     *
     * @param view numero1 nos guarda el primer numero digitado
     *             operacion identifica la operacion a realizar
     *             tv.resultado muestra el cero
     */
    public void OperacionRasta(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        operacion = "-";
        tvResultado.setText("0");
    }



    public void EscribirUno(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor == 0.0){
            tvResultado.setText("1");
        }else{
            tvResultado.setText(tvResultado.getText() + "1");
        }
    }

    public void EscribirDos(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor == 0.0){
            tvResultado.setText("2");
        }else{
            tvResultado.setText(tvResultado.getText() + "2");
        }
    }

    public void EscribirTres(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor == 0.0){
            tvResultado.setText("3");
        }else{
            tvResultado.setText(tvResultado.getText() + "3");
        }
    }

    /**Esta es la funcion de sumar
     *
     * @param view numero1 nos guarda el primer numero digitado
     *             operacion identifica la operacion a realizar
     *             tv.resultado muestra el cero
     */
    public void OperacionSuma(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        operacion = ("+");
        tvResultado.setText("0");
    }

    public void EscribirCero(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor == 0.0){
            tvResultado.setText("0");
        }else{
            tvResultado.setText(tvResultado.getText() + "0");
        }
    }


    public void OperacionIgualar(View view) {
        /**Esta es la funcion de operar o igualar
         *
         * @param view numero2 nos guarda el primer numero digitado*/
        numero2 = Float.parseFloat(tvResultado.getText().toString());
        /**Verifica que se cumpla la condición
         * */
        if(operacion.equals("/")){
            /**Si el segundo número digitado es cero, se le avisa al usuario que no
             * puede hacer una división
             * */
            if(numero2 == 0.0f){
                tvResultado.setText("0");
                Toast.makeText(this, "OPERACIÓN NO VALIDAD", Toast.LENGTH_LONG).show();

            }else{
                /**Verifica que se cumpla la condición, y si el primero numero es distinto a cero
                 * se realiza la división
                 * */
                float result = numero1 / numero2;
                tvResultado.setText(result + " ");
            }
            /**Verifica que se cumpla la condición  para multiplicar los 2 numeros
             * */
        }else if (operacion.equals("*")){
            float result = numero1 * numero2;
            tvResultado.setText(result + " ");
/**Verifica que se cumpla la condición  para sumar los 2 numeros
 * */
        }else if (operacion.equals("+")){
            float result = numero1 + numero2;
            tvResultado.setText(" " + result );
/**Verifica que se cumpla la condición  para restar los 2 numeros
 * */
        }else if (operacion.equals("-")){
            float result = numero1 - numero2;
            tvResultado.setText(result + " ");
/**Verifica que se cumpla la condición  para sacar el porcentaje del primer numero
 * */
        }else if (operacion.equals("%")){
            float result = numero1 * 0.100f;
            tvResultado.setText(result + " ");

        }
        /**se inicializa de nuevo las 3 variables en cero para empezar otra operacion
         * */
        numero1 = 0.0f;
        numero2 = 0.0f;
        operacion = "";



    }

}