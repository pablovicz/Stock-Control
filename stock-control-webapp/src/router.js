import Vue from "vue";
import Router from "vue-router";
import ProductsList from "./components/ProductsList.vue";
import AddProduct from "./components/AddProduct.vue";
import SearchProducts from "./components/SearchProducts.vue";
import Product from "./components/Product.vue";
import { component } from "vue/types/umd";

Vue.use(Router);

export default new Router({
    mode: "history",
    routes: [
        {
            path: "/",
            name: "products",
            alias: "/products",
            component: ProductsList,
            children: [
                {
                    path: "product/:id",
                    name: "product-details",
                    component: Product,
                    props: true
                }
            ]
        },
        {
            path: "/add",
            name: "add",
            component: AddProduct
        },
        {
            path: "/search",
            name: "search",
            component: SearchProducts
        }
    ]
});