<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    exclude-result-prefixes="xs"
    version="2.0">
    <xsl:template match="/">
        <html>
            <head>
                <title>Liste Relever</title>
            </head>
            <body>
                <h2>Liste des releves</h2>
                <xsl:for-each select="/relever">
                    <ul>
                        <li> RIB : <xsl:value-of select="@RIB"/> </li>
                        <li> Date Relever : <xsl:value-of select="dateRelever"/> </li>
                        <li> Solde :  <xsl:value-of select="solde"/> </li>
                        <li> 
                            Operations de type crédit :
                            <xsl:for-each select="/relever/operations">
                                <ul >
                                    <li> Date début : <xsl:value-of select="@dateDebut"/>  </li>
                                    <li> Date début : <xsl:value-of select="@dateFin"/> </li>
                                </ul>
                                <table border="1" width="75%">
                                    <tr>
                                        <th>Type</th>
                                        <th>Date</th>
                                        <th>Montant</th>
                                        <th>Description</th>
                                        
                                    </tr>
                                    <xsl:for-each select="operation[@type='CREDIT']">
                                        <tr>
                                            <td><xsl:value-of select="@type"/></td>
                                            <td><xsl:value-of select="@date"/></td>
                                            <td><xsl:value-of select="@montant"/></td>
                                            <td><xsl:value-of select="@description"/></td>
                                            
                                        </tr>
                                    </xsl:for-each>
                                </table>
                            </xsl:for-each>
                            
                        </li>
                    </ul>
                    
                </xsl:for-each>
                <ul>
                    <li>
                        
                    </li>
                </ul>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>