/*
 *  Copyright (c) 2017-present, Pumpkin Movie, Inc. All rights reserved.
 *
 *  You are hereby granted a non-exclusive, worldwide, royalty-free license to use,
 *  copy, modify, and distribute this software in source code or binary form for use
 *  in connection with the web services and APIs provided by Pumpkin Movie.
 *
 *  As with any software that integrates with the pumpkin movie platform, your use of
 *  this software is subject to the Pumpkin Movie Developer Principles and Policies
 *  [http://developers.vcinema.com/policy/]. This copyright notice shall be
 *  included in all copies or substantial portions of the software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 *  FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 *  COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 *  IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 *  CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package cn.vcinema.partner;

/**
 * Partner Info
 * <p>
 * User: Xulin Zhuang
 * Date: 29/1/2018
 * Time: 12:55 PM
 */
public class PartnerInfo {
    public final static String format = "JSON";
    public final static String pay_action = "/pay/redeem_code";
    public final static String pay_statistics_action = "/pay/redeem_code_statistics";
    public final static String movie_action = "/movie/sync";
    public final static String media_action = "/media/sync";
    public final static String media_offline_action = "/media/offline_sync";
    public final static String pay_order_action = "/pay/pay_order";
    public final static String pay_order_operator_action = "/pay/pay_order_operator";
    public final static String pay_order_shdx_action = "/pay/pay_order_shdx";
    public final static String send_insufficient_balance_msg_action = "/send/insufficientBalance";
    public final static String get_order_action = "/pay/get_order";
    public final static String get_order_by_date_action = "/pay/get_order_by_date";
    public final static String httpPostMethod = "POST";
    public final static String httpGetMethod = "GET";
    public final static String pid = "TEST_PID";
    public final static String codeType = "m1";
    public final static String productType = "m1";
    public final static String accessSecret = "TEST_ACCESS_SECRET";
    public final static String version = "v1";
}
