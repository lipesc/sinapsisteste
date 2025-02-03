import { createApp } from 'vue'
import './style.css'
import App from './App.vue'
import router from './router';
import Toast from "vue-toastification"
import "vue-toastification/dist/index.css"

const options = {
  // toasts
};
const app = createApp(App);
//createApp(App).mount('#app')
app.use(router);
app.use(Toast);
app.mount("#app");