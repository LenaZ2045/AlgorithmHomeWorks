package com.telran.org.algorithm_hw_30_10_2023;

import java.util.HashMap;

public class HasMapSearch {
    public static void main(String[] args) {
        String inputString = "Lorem ipsum dolor sit amet consectetur, adipisicing elit. Accusamus, maiores obcaecati rem numquam deserunt itaque voluptatum? Numquam veniam non, atque libero ipsa officiis dolor obcaecati ipsam magni? Officia consectetur vitae inventore amet consequuntur praesentium ab dicta, corporis, repellat unde quidem tempore reiciendis dolor facilis aperiam? Itaque cumque tempora, iusto tempore, minus nihil iste eos veniam, placeat quibusdam nemo et. Blanditiis optio exercitationem soluta a ullam molestiae eligendi, minima magnam assumenda excepturi tempore quas impedit cupiditate sapiente quasi deleniti temporibus explicabo consequuntur doloribus magni? Enim unde inventore excepturi, doloremque eum laudantium, natus minima optio voluptate consequatur, non possimus officiis nobis atque! Possimus, culpa libero distinctio quo fugiat est ratione iure tempora recusandae. Officiis, dolores quibusdam voluptas quia nihil praesentium, nulla minus ut quo iste atque nobis fuga corporis earum porro voluptates repudiandae? Ipsum ex atque repellat, quaerat a ducimus totam impedit quibusdam vel vitae temporibus consectetur cum, dolorem nulla excepturi, id nostrum hic laborum ab maiores libero doloribus ea beatae non. Vero velit numquam, laboriosam architecto quibusdam nihil excepturi maiores unde commodi incidunt doloremque mollitia aut dolorem aliquam dolore? Sed autem repellendus nobis nesciunt ea voluptatibus est mollitia? Magni, quas. Accusantium totam incidunt sequi natus magni explicabo laborum voluptatibus, nulla dignissimos debitis delectus doloremque cupiditate. Ex porro exercitationem iusto facere asperiores voluptate saepe quibusdam corrupti quas voluptates, nobis consectetur ab molestiae ad explicabo laboriosam dolor cupiditate eos beatae. Corporis voluptate voluptatem, necessitatibus excepturi tenetur sit quia totam velit praesentium vel nesciunt, officiis eaque assumenda. A asperiores fugiat debitis culpa odio deleniti ipsum id tempora sequi? Provident distinctio quisquam inventore accusamus neque illo nihil, debitis soluta, veniam aliquid quaerat laboriosam ex obcaecati nostrum. Consectetur sequi cumque quaerat porro commodi voluptatum adipisci sit, officia labore illo inventore doloribus rerum magni accusantium? At, voluptas sunt! Quidem eos quod dolor saepe ex! Nobis odio quam aliquam itaque mollitia expedita dicta ex cupiditate vel natus, quasi et. Accusantium quo magni fuga vitae soluta veniam atque, corporis ipsam laboriosam molestiae! Reprehenderit, veniam autem aspernatur accusamus deserunt accusantium quibusdam rerum quaerat illo! Ratione temporibus voluptatem laboriosam soluta quos sunt esse deserunt totam labore nisi vitae harum quidem quisquam sint repudiandae dicta animi nostrum voluptatum illum ducimus inventore dolorem, ullam laudantium? Sapiente, laborum recusandae. Aperiam quod modi dolorum beatae accusamus expedita corporis alias, labore veniam nam autem distinctio sapiente perspiciatis tempore voluptas doloremque saepe at suscipit sequi earum non unde! Quas fugit eos ratione. Amet quos in unde ullam consequatur recusandae voluptatum error doloribus dolores, atque accusantium animi deserunt placeat non excepturi perferendis a laudantium voluptas inventore sequi exercitationem temporibus, vel tenetur. Natus voluptate quia necessitatibus. Reiciendis dicta omnis nam tempore suscipit, quos excepturi, molestiae nostrum incidunt provident, et laborum dolorum cumque vitae illum officia voluptatibus necessitatibus dignissimos asperiores eum autem in ut obcaecati. Fuga eaque asperiores numquam laboriosam voluptatibus obcaecati magnam aperiam iusto, quos nobis, quis perspiciatis aliquid, excepturi vitae reprehenderit possimus soluta laborum accusantium adipisci ut! Perspiciatis ex dignissimos nostrum tempora, commodi vel laborum doloremque consequuntur reiciendis fugit aliquid hic possimus unde odit reprehenderit, totam corrupti fuga!\n\n";
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);

            if (ch != ' ') {
                if (charCountMap.containsKey(ch)) {
                    charCountMap.put(ch, charCountMap.get(ch) + 1);
                } else {
                    charCountMap.put(ch, 1);
                }
            }
        }

        System.out.println("Frequency dictionary of English letters:");
        for (char ch : charCountMap.keySet()) {
            System.out.println(ch + ": " + charCountMap.get(ch));
        }
    }
}