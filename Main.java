import gg.acai.chatgpt.ChatGPT;
import gg.acai.chatgpt.Conversation;

public class Main {
    public static void main(String[] args) {
        ChatGPT chatGpt = ChatGPT.newBuilder()
            .sessionToken("eyJhbGciOiJkaXIiLCJlbmMiOiJBMjU2R0NNIn0..deUegt6FJkj4JnTO.xZz9IQFKspp13xEnN8CFOtL_2RQ-R9A8p5utk4YonFHiYves3_DJkaka9wZbfiwV2dDg_Rg38ek4fcGMmdkw9oO2Ae4ClvqDQxf-c7aGRSr00Ce9FjnYs9iIVPeq7HqWVrbcIrZH96ivBaTMRm5m6lr8ZtILYVYaNk4eyX-G2OYhmNXDY69UHv9M3fIP6-4OIoOFKTYvoqNY1t9UlqYHcLTuapLtJjhCT4KLLKNiaoM9t7ZnS2KPaVP24qdprK9IyMlZn0lJil-iGeK_HoX9TNj3kICHBG7Axfhi0OghB3o1s0bQzU0zf5GwfNwA3zWk-JaSC_4NEuZWFvXTve2lbgbdhoted_t9qSYwD1iPRh280cjL6tkUNGHqRxKCGHeSq2eumlFte7sLXNgJuyibZu7w0ndVVqtdIpELGN2HRhUXGvCaDHZ_5Geply4s1hQAvY1tOsrXMKX7IjZBz0mhHBUi9k0ZfSD5M_AL0MXHompRgTjKIE1Nbr1U-VvxHXANC9mdyAEnrcjJCWIfWhBB9JRrxjXtrCV23ZFN7QEVGYIqvwXMd0dLjR8aRF99sUK9aI2Gehdw4zW3nAU5z1NZu9VaiC8ZWQeKkAFLQD_EtvVcmZN5dzO0uQ7fmG6Cqr5rnFCgRr0ZddmILPrMljLMFG11VhgQawjFtQ12bbvMe0exyJIqk7XWBVYO0zVkAkwx7yEtAV7WvNnaQ_5-EUSBEVqvpFgaH3AIjrb-62Yll_P2bmk1bqtB5Bzgoh0h2teKdfZcnFUhXENSxfaNUk3ZRmfkiSfGGY-T3zNVAfjhTwBN18g_vH6xXKbnPlLdJmnekcMgummQWTiYECdZubSlgUnftMoRVKO-FFr419IR4_PlsYFygwVltiRJe8NAzrQihLeTJwP-EfKqcIrzTxy1AIxeDnIFpQyEiS7iRtg7h2mB1zajtl0eE14InBXSSDKV1pycMo2ZRK6-PyTsd64dVtsPPxYFZvl_ttV9i5ZP9PbdwBAvK7TUxrcYZRh5A7EmpoggCzuVUdOHRWwC7kBL6VOx4syM9f5Q9u1x4K2bHwPbKWF28wrEu5SMCsvVvEzwFg6PmqAPyyivDamTKExhpfCzsvTdyMEeOxVlGJ9EywDl5jzc5d3TtKHisr-qVPDPoxK8xGEkzpTK28KxhSV3WUzpSmnifevVCADTdBLL6wW0ERf2NSK5TpH_NRwjYxgBVeptRfjq02CJf8k83HK2AjQ2U5f7Xi381aIl9BCV30iYyxG5Q74eEM-ut9UyS-As2ss2dxRL6NZGYlPEWAONMnw_4kqa5VOFmr_VmzUGLXtw8BdL6dzUwwA02YZYSsWlXIQDIgeWl_0Mhgy5oYzgD9oHtVDe2_QRiuT4HXCnE_tuT64mFDvSuUsSxfsnSjoQ7rR_8MFSe0vP2YxuT2_gsoSJity17jC7v5VaoMlARJbBlhH3N9A-MK-aCaM98COb8840BgkRattGIOtL2ZacCaiIlhWORBbbiM0c0LrmKB_XAa09hwvU2Q5yj7Xtw4nxoMpj1pt2hAMME7ulgELlEppuLBQXfDVrnUWdoRrkROoGkUJTh4BYB-bRTXYcA2ONdiSYJjwz7FZRAcp2faS62l_5RMEkp0neiB0vVxxe6OwkcdRZzBOKAKTg-qQbVUhMWDG75KssyXbFHU2dYrbd-b_s_46hDbC56ZT19hyaxBmca00EblIL7q-RWIINk1mLFl8l93LS4axD7qwxOykbSKYU8shAhJp9Tk8bEBmBAb-MBJh-JczRKeuiK8GiaoW-4pKjDlDhZdgHhd92hRWT5h1kMhWWipy4bbBsLZELNRJB2zVg1oVeo-s5evZTRwW9CwX1WqQuINvf62RKZBjxFrpgwkGpPr1JzZ3CeoFAyJ-d3rhul_IFFcworlo9Z_rSK7jwVZh_fCSFAqyZUCqvk83HUiVvQAeV9EsKOlqGZr0L4u3MxAzrZXQYh7ApgLsQLtb84Z8DaVbIrkLvYqjEqfsVqldoeotHRCIb9BGMKlCqD1aOfBcj0VHugFMNholxZevhBHWrWr_s4bC_BomvFZV4W2WkqcYqagKwrdnMclCKmeiYipDfVuYtGczV_c2csYUTTV-38dbbR9-AGNuGm7Fcwa2gm_8U-Z_ySQ6FPQGG9i30DoQiqHPy9xVrId90xrVvCooM5qTaAW0sGiT9VMcf24eKCArxk6J1x_ckcSkRIxX55f1FuKKf-iefdZHVQjy2H8rcoF8gPFs-VDBG2_tOlge2KOaK-O8gxUXwGvPnqG23w7TrGOk_sxU-vXKNcuOKxl3rfSDELRFXZL0XZu4yZgmNwO9Ndlsg5r0yJeO6IZpcqk3KUP3el8MDU42TAyJoPwKrSqr-773tOo32yGAy8ulx9_58sMR7AiXnBHlx2hpNo_OYo9NCfg2LsDrD50IAbgwK_E676MhjzcXtViHGPWp9B5vW1HJUuUH0Zh1JA-Oi3xDd_mso1U48zTQYAyhQ0TZI7BRxAfzzZcNAaMt1OgmOwwHNZK4CFY_p3fuIfgeqZuOdUVQ7v6mO_yzhVw.IPGQS1O4WuWZtsUkHZh_rg") // required field: get from cookies
            .cfClearance("V93O9MKg0NLGTcZXw0FjeXOzNo0PJ8NpiF6BetK.fTc-1680265616-0-1-cbee9a81.817a9227.a04d9b2d-160") // required to bypass Cloudflare: get from cookies
            .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/115.0.0.0 Safari/537.36 Edg/115.0.0.0") // required to bypass Cloudflare: google 'what is my user agent'
            .build(); // builds the ChatGPT client



        chatGpt.getComplexAccessCache().refreshAccessToken() // refreshing cache and verifies session token
    .whenComplete((accessToken) -> { // called when the promise is completed, not required
        System.out.println("Access token: " + accessToken);
    });
        Conversation conversation = chatGpt.createConversation();
        conversation.sendMessageAsync("Hello!")
            .whenComplete((response) -> { // called when the promise is completed with its response
                System.out.println("Response: " + response.getMessage());
            });
    }
}