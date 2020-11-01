/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ultilitarios;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author Nicksson
 */
public final class FormatoMascara {
    
    static final DateFormat formatoUtilData = new SimpleDateFormat ("yyyy/MM/dd");
    static final DateFormat formatoData = new SimpleDateFormat ("dd/MM/yyyy");
    static final DecimalFormat formatoDecimal = new DecimalFormat("0.00"); 
    static final DateFormat formatoAno = new SimpleDateFormat("yyyy");
    
}
