/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facturacion;

import java.math.BigDecimal;

/**
 *
 * @author oscarquinteros
 */
public interface ComprobanteFiscal {
   public BigDecimal totalIVA();
   public BigDecimal totalComprobante();
    
}
